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
package org.apache.camel.component.aws2.kinesis.springboot;

import org.apache.camel.component.aws2.kinesis.Kinesis2Component;
import org.apache.camel.component.aws2.kinesis.Kinesis2Configuration;
import org.apache.camel.component.aws2.kinesis.Kinesis2ShardClosedStrategyEnum;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import software.amazon.awssdk.core.Protocol;
import software.amazon.awssdk.services.kinesis.KinesisClient;
import software.amazon.awssdk.services.kinesis.model.ShardIteratorType;

/**
 * Consume and produce records from and to AWS Kinesis Streams using AWS SDK
 * version 2.x.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.aws2-kinesis")
public class Kinesis2ComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the aws2-kinesis component. This
     * is enabled by default.
     */
    private Boolean enabled;
    /**
     * This option will set the CBOR_ENABLED property during the execution
     */
    private Boolean cborEnabled = true;
    /**
     * Component configuration. The option is a
     * org.apache.camel.component.aws2.kinesis.Kinesis2Configuration type.
     */
    private Kinesis2Configuration configuration;
    /**
     * Set the need for overidding the endpoint. This option needs to be used in
     * combination with uriEndpointOverride option
     */
    private Boolean overrideEndpoint = false;
    /**
     * The region in which Kinesis Firehose client needs to work. When using
     * this parameter, the configuration will expect the lowercase name of the
     * region (for example ap-east-1) You'll need to use the name
     * Region.EU_WEST_1.id()
     */
    private String region;
    /**
     * Set the overriding uri endpoint. This option needs to be used in
     * combination with overrideEndpoint option
     */
    private String uriEndpointOverride;
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
     * Defines where in the Kinesis stream to start getting records
     */
    private ShardIteratorType iteratorType = ShardIteratorType.TRIM_HORIZON;
    /**
     * Maximum number of records that will be fetched in each poll
     */
    private Integer maxResultsPerRequest = 1;
    /**
     * The sequence number to start polling from. Required if iteratorType is
     * set to AFTER_SEQUENCE_NUMBER or AT_SEQUENCE_NUMBER
     */
    private String sequenceNumber;
    /**
     * Define what will be the behavior in case of shard closed. Possible value
     * are ignore, silent and fail. In case of ignore a message will be logged
     * and the consumer will restart from the beginning,in case of silent there
     * will be no logging and the consumer will start from the beginning,in case
     * of fail a ReachedClosedStateException will be raised
     */
    private Kinesis2ShardClosedStrategyEnum shardClosed = Kinesis2ShardClosedStrategyEnum.ignore;
    /**
     * Defines which shardId in the Kinesis stream to get records from
     */
    private String shardId;
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
     * Amazon Kinesis client to use for all requests for this endpoint. The
     * option is a software.amazon.awssdk.services.kinesis.KinesisClient type.
     */
    private KinesisClient amazonKinesisClient;
    /**
     * If we want to a KinesisAsyncClient instance set it to true
     */
    private Boolean asyncClient = false;
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
     * Used for enabling or disabling all consumer based health checks from this
     * component
     */
    private Boolean healthCheckConsumerEnabled = true;
    /**
     * Used for enabling or disabling all producer based health checks from this
     * component. Notice: Camel has by default disabled all producer based
     * health-checks. You can turn on producer checks globally by setting
     * camel.health.producersEnabled=true.
     */
    private Boolean healthCheckProducerEnabled = true;
    /**
     * To define a proxy host when instantiating the Kinesis client
     */
    private String proxyHost;
    /**
     * To define a proxy port when instantiating the Kinesis client
     */
    private Integer proxyPort;
    /**
     * To define a proxy protocol when instantiating the Kinesis client
     */
    private Protocol proxyProtocol = Protocol.HTTPS;
    /**
     * Amazon AWS Access Key
     */
    private String accessKey;
    /**
     * If using a profile credentials provider this parameter will set the
     * profile name.
     */
    private String profileCredentialsName;
    /**
     * Amazon AWS Secret Key
     */
    private String secretKey;
    /**
     * If we want to trust all certificates in case of overriding the endpoint
     */
    private Boolean trustAllCertificates = false;
    /**
     * Set whether the Kinesis client should expect to load credentials through
     * a default credentials provider or to expect static credentials to be
     * passed in.
     */
    private Boolean useDefaultCredentialsProvider = false;
    /**
     * Set whether the Kinesis client should expect to load credentials through
     * a profile credentials provider.
     */
    private Boolean useProfileCredentialsProvider = false;

    public Boolean getCborEnabled() {
        return cborEnabled;
    }

    public void setCborEnabled(Boolean cborEnabled) {
        this.cborEnabled = cborEnabled;
    }

    public Kinesis2Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Kinesis2Configuration configuration) {
        this.configuration = configuration;
    }

    public Boolean getOverrideEndpoint() {
        return overrideEndpoint;
    }

    public void setOverrideEndpoint(Boolean overrideEndpoint) {
        this.overrideEndpoint = overrideEndpoint;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getUriEndpointOverride() {
        return uriEndpointOverride;
    }

    public void setUriEndpointOverride(String uriEndpointOverride) {
        this.uriEndpointOverride = uriEndpointOverride;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public ShardIteratorType getIteratorType() {
        return iteratorType;
    }

    public void setIteratorType(ShardIteratorType iteratorType) {
        this.iteratorType = iteratorType;
    }

    public Integer getMaxResultsPerRequest() {
        return maxResultsPerRequest;
    }

    public void setMaxResultsPerRequest(Integer maxResultsPerRequest) {
        this.maxResultsPerRequest = maxResultsPerRequest;
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Kinesis2ShardClosedStrategyEnum getShardClosed() {
        return shardClosed;
    }

    public void setShardClosed(Kinesis2ShardClosedStrategyEnum shardClosed) {
        this.shardClosed = shardClosed;
    }

    public String getShardId() {
        return shardId;
    }

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public KinesisClient getAmazonKinesisClient() {
        return amazonKinesisClient;
    }

    public void setAmazonKinesisClient(KinesisClient amazonKinesisClient) {
        this.amazonKinesisClient = amazonKinesisClient;
    }

    public Boolean getAsyncClient() {
        return asyncClient;
    }

    public void setAsyncClient(Boolean asyncClient) {
        this.asyncClient = asyncClient;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public Boolean getHealthCheckConsumerEnabled() {
        return healthCheckConsumerEnabled;
    }

    public void setHealthCheckConsumerEnabled(Boolean healthCheckConsumerEnabled) {
        this.healthCheckConsumerEnabled = healthCheckConsumerEnabled;
    }

    public Boolean getHealthCheckProducerEnabled() {
        return healthCheckProducerEnabled;
    }

    public void setHealthCheckProducerEnabled(Boolean healthCheckProducerEnabled) {
        this.healthCheckProducerEnabled = healthCheckProducerEnabled;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public Protocol getProxyProtocol() {
        return proxyProtocol;
    }

    public void setProxyProtocol(Protocol proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getProfileCredentialsName() {
        return profileCredentialsName;
    }

    public void setProfileCredentialsName(String profileCredentialsName) {
        this.profileCredentialsName = profileCredentialsName;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public Boolean getTrustAllCertificates() {
        return trustAllCertificates;
    }

    public void setTrustAllCertificates(Boolean trustAllCertificates) {
        this.trustAllCertificates = trustAllCertificates;
    }

    public Boolean getUseDefaultCredentialsProvider() {
        return useDefaultCredentialsProvider;
    }

    public void setUseDefaultCredentialsProvider(
            Boolean useDefaultCredentialsProvider) {
        this.useDefaultCredentialsProvider = useDefaultCredentialsProvider;
    }

    public Boolean getUseProfileCredentialsProvider() {
        return useProfileCredentialsProvider;
    }

    public void setUseProfileCredentialsProvider(
            Boolean useProfileCredentialsProvider) {
        this.useProfileCredentialsProvider = useProfileCredentialsProvider;
    }
}