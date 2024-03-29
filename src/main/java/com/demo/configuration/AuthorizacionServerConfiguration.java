//package com.demo.configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
//import org.springframework.security.oauth2.provider.token.TokenStore;
//import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;
//
//@Configuration
//@EnableAuthorizationServer
//public class AuthorizacionServerConfiguration extends AuthorizationServerConfigurerAdapter {
//    @Autowired
//    @Qualifier("authenticationManagerBean")
//    private AuthenticationManager authenticationManager;
//    @Autowired
//    private TokenStore tokenStore;
//    @Autowired
//    private BCryptPasswordEncoder encoder;
//
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//        clients.inMemory()
//                .withClient("client")
//                .authorizedGrantTypes("password", "authorization_code", "refresh_token", "implicit")
//                .authorities("ROLE_ADMIN", "ROLE_TRUSTED_CLIENT", "USER")
//                .scopes("read", "write")
//                .autoApprove(true)
//                .secret(encoder.encode("password"));
//    }
//
//
//    @Override
//    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//        endpoints
//                .authenticationManager(authenticationManager)
//                .tokenStore(tokenStore);
//    }
//
//    @Bean
//    public TokenStore tokenStore() {
//        return new InMemoryTokenStore();
//    }
//}