/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.sjms.springboot;

import jakarta.jms.ConnectionFactory;
import jakarta.jms.ExceptionListener;
import org.apache.camel.component.sjms.jms.DestinationCreationStrategy;
import org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy;
import org.apache.camel.component.sjms.jms.MessageCreatedStrategy;
import org.apache.camel.spi.HeaderFilterStrategy;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Send and receive messages to/from a JMS Queue or Topic using plain JMS 1.x
 * API.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.sjms")
public class SjmsComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the sjms component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The connection factory to be use. A connection factory must be configured
     * either on the component or endpoint. The option is a
     * jakarta.jms.ConnectionFactory type.
     */
    private ConnectionFactory connectionFactory;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Whether autowiring is enabled. This is used for automatic autowiring
     * options (the option must be marked as autowired) by looking up in the
     * registry to find if there is a single instance of matching type, which
     * then gets configured on the component. This can be used for automatic
     * configuring JDBC data sources, JMS connection factories, AWS Clients,
     * etc.
     */
    private Boolean autowiredEnabled = true;
    /**
     * To use a custom DestinationCreationStrategy. The option is a
     * org.apache.camel.component.sjms.jms.DestinationCreationStrategy type.
     */
    private DestinationCreationStrategy destinationCreationStrategy;
    /**
     * Specifies the JMS Exception Listener that is to be notified of any
     * underlying JMS exceptions. The option is a jakarta.jms.ExceptionListener
     * type.
     */
    private ExceptionListener exceptionListener;
    /**
     * Pluggable strategy for encoding and decoding JMS keys so they can be
     * compliant with the JMS specification. Camel provides one implementation
     * out of the box: default. The default strategy will safely marshal dots
     * and hyphens (. and -). Can be used for JMS brokers which do not care
     * whether JMS header keys contain illegal characters. You can provide your
     * own implementation of the
     * org.apache.camel.component.jms.JmsKeyFormatStrategy and refer to it using
     * the # notation. The option is a
     * org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy type.
     */
    private JmsKeyFormatStrategy jmsKeyFormatStrategy;
    /**
     * To use the given MessageCreatedStrategy which are invoked when Camel
     * creates new instances of jakarta.jms.Message objects when Camel is
     * sending a JMS message. The option is a
     * org.apache.camel.component.sjms.jms.MessageCreatedStrategy type.
     */
    private MessageCreatedStrategy messageCreatedStrategy;
    /**
     * Specifies the interval between recovery attempts, i.e. when a connection
     * is being refreshed, in milliseconds. The default is 5000 ms, that is, 5
     * seconds. The option is a long type.
     */
    private Long recoveryInterval = 5000L;
    /**
     * Specifies the maximum number of concurrent consumers for continue routing
     * when timeout occurred when using request/reply over JMS.
     */
    private Integer replyToOnTimeoutMaxConcurrentConsumers = 1;
    /**
     * Configures how often Camel should check for timed out Exchanges when
     * doing request/reply over JMS. By default Camel checks once per second.
     * But if you must react faster when a timeout occurs, then you can lower
     * this interval, to check more frequently. The timeout is determined by the
     * option requestTimeout. The option is a long type.
     */
    private Long requestTimeoutCheckerInterval = 1000L;
    /**
     * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
     * header to and from Camel message. The option is a
     * org.apache.camel.spi.HeaderFilterStrategy type.
     */
    private HeaderFilterStrategy headerFilterStrategy;

    public ConnectionFactory getConnectionFactory() {
        return connectionFactory;
    }

    public void setConnectionFactory(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public DestinationCreationStrategy getDestinationCreationStrategy() {
        return destinationCreationStrategy;
    }

    public void setDestinationCreationStrategy(
            DestinationCreationStrategy destinationCreationStrategy) {
        this.destinationCreationStrategy = destinationCreationStrategy;
    }

    public ExceptionListener getExceptionListener() {
        return exceptionListener;
    }

    public void setExceptionListener(ExceptionListener exceptionListener) {
        this.exceptionListener = exceptionListener;
    }

    public JmsKeyFormatStrategy getJmsKeyFormatStrategy() {
        return jmsKeyFormatStrategy;
    }

    public void setJmsKeyFormatStrategy(
            JmsKeyFormatStrategy jmsKeyFormatStrategy) {
        this.jmsKeyFormatStrategy = jmsKeyFormatStrategy;
    }

    public MessageCreatedStrategy getMessageCreatedStrategy() {
        return messageCreatedStrategy;
    }

    public void setMessageCreatedStrategy(
            MessageCreatedStrategy messageCreatedStrategy) {
        this.messageCreatedStrategy = messageCreatedStrategy;
    }

    public Long getRecoveryInterval() {
        return recoveryInterval;
    }

    public void setRecoveryInterval(Long recoveryInterval) {
        this.recoveryInterval = recoveryInterval;
    }

    public Integer getReplyToOnTimeoutMaxConcurrentConsumers() {
        return replyToOnTimeoutMaxConcurrentConsumers;
    }

    public void setReplyToOnTimeoutMaxConcurrentConsumers(
            Integer replyToOnTimeoutMaxConcurrentConsumers) {
        this.replyToOnTimeoutMaxConcurrentConsumers = replyToOnTimeoutMaxConcurrentConsumers;
    }

    public Long getRequestTimeoutCheckerInterval() {
        return requestTimeoutCheckerInterval;
    }

    public void setRequestTimeoutCheckerInterval(
            Long requestTimeoutCheckerInterval) {
        this.requestTimeoutCheckerInterval = requestTimeoutCheckerInterval;
    }

    public HeaderFilterStrategy getHeaderFilterStrategy() {
        return headerFilterStrategy;
    }

    public void setHeaderFilterStrategy(
            HeaderFilterStrategy headerFilterStrategy) {
        this.headerFilterStrategy = headerFilterStrategy;
    }
}