package com.myfunds.fds.config;

import com.myfunds.fds.grpc.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcConfig {
    /**
     * 配置需要连接的server的ip:port
     */
    @Bean
    ManagedChannel channel(@Value("${app-config.grpc-server-name}") String name,
                           @Value("${app-config.grpc-server-port}") Integer port,
                           @Value("${app-config.max-message-size}") Integer size){
        return ManagedChannelBuilder.forAddress(name,port).maxInboundMessageSize(size)
                .usePlaintext()
                .build();
    }

    /**
     * 将proto生成的stub放入容器中，方便调用
     */
    @Bean
    SalesLeaderServiceGrpc.SalesLeaderServiceBlockingStub salesLeaderServiceBlockingStub(ManagedChannel channel) {
        return  SalesLeaderServiceGrpc.newBlockingStub(channel);
    }
    @Bean
    SalesManagerServiceGrpc.SalesManagerServiceBlockingStub salesManagerServiceBlockingStub(ManagedChannel channel) {
        return  SalesManagerServiceGrpc.newBlockingStub(channel);
    }
}