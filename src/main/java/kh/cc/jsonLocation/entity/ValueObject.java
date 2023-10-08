package kh.cc.jsonLocation.entity;

/**
 * @author ：Lkh
 * @date ：Created in 2023/9/11 9:08 PM
 */
public class ValueObject {
    String json = "{\n" +
            "  \"Id\": \"4b7da3f601651b8edc67ece6dc15214c008a7c52692609e676d711b5782a8e6f\",\n" +
            "  \"Created\": \"2023-04-22T11:24:39.251184447Z\",\n" +
            "  \"Path\": \"bin/docker-startup.sh\",\n" +
            "  \"Args\": [],\n" +
            "  \"State\": {\n" +
            "    \"Status\": \"running\",\n" +
            "    \"Running\": true,\n" +
            "    \"Paused\": false,\n" +
            "    \"Restarting\": false,\n" +
            "    \"OOMKilled\": false,\n" +
            "    \"Dead\": false,\n" +
            "    \"Pid\": 8784,\n" +
            "    \"ExitCode\": 0,\n" +
            "    \"Error\": \"\",\n" +
            "    \"StartedAt\": \"2023-09-06T14:03:34.119504838Z\",\n" +
            "    \"FinishedAt\": \"2023-09-06T14:03:33.824237836Z\"\n" +
            "  },\n" +
            "  \"Image\": \"sha256:bdf60dc2ada3ce53a95a577f295f677d8e8aa02f3a7757c03c86ea58ae4a8234\",\n" +
            "  \"ResolvConfPath\": \"/var/lib/docker/containers/4b7da3f601651b8edc67ece6dc15214c008a7c52692609e676d711b5782a8e6f/resolv.conf\",\n" +
            "  \"HostnamePath\": \"/var/lib/docker/containers/4b7da3f601651b8edc67ece6dc15214c008a7c52692609e676d711b5782a8e6f/hostname\",\n" +
            "  \"HostsPath\": \"/var/lib/docker/containers/4b7da3f601651b8edc67ece6dc15214c008a7c52692609e676d711b5782a8e6f/hosts\",\n" +
            "  \"LogPath\": \"/var/lib/docker/containers/4b7da3f601651b8edc67ece6dc15214c008a7c52692609e676d711b5782a8e6f/4b7da3f601651b8edc67ece6dc15214c008a7c52692609e676d711b5782a8e6f-json.log\",\n" +
            "  \"Name\": \"/nacos\",\n" +
            "  \"RestartCount\": 0,\n" +
            "  \"Driver\": \"overlay2\",\n" +
            "  \"Platform\": \"linux\",\n" +
            "  \"MountLabel\": \"\",\n" +
            "  \"ProcessLabel\": \"\",\n" +
            "  \"AppArmorProfile\": \"\",\n" +
            "  \"ExecIDs\": null,\n" +
            "  \"HostConfig\": {\n" +
            "    \"Binds\": [\n" +
            "      \"/mydata/nacos/logs:/home/nacos/logs\",\n" +
            "      \"/mydata/nacos/conf/application.properties:/home/nacos/conf/application.properties\"\n" +
            "    ],\n" +
            "    \"ContainerIDFile\": \"\",\n" +
            "    \"LogConfig\": {\n" +
            "      \"Type\": \"json-file\",\n" +
            "      \"Config\": {}\n" +
            "    },\n" +
            "    \"NetworkMode\": \"default\",\n" +
            "    \"PortBindings\": {\n" +
            "      \"8848/tcp\": [\n" +
            "        {\n" +
            "          \"HostIp\": \"\",\n" +
            "          \"HostPort\": \"8848\"\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    \"RestartPolicy\": {\n" +
            "      \"Name\": \"always\",\n" +
            "      \"MaximumRetryCount\": 0\n" +
            "    },\n" +
            "    \"AutoRemove\": false,\n" +
            "    \"VolumeDriver\": \"\",\n" +
            "    \"VolumesFrom\": null,\n" +
            "    \"CapAdd\": null,\n" +
            "    \"CapDrop\": null,\n" +
            "    \"CgroupnsMode\": \"host\",\n" +
            "    \"Dns\": [],\n" +
            "    \"DnsOptions\": [],\n" +
            "    \"DnsSearch\": [],\n" +
            "    \"ExtraHosts\": null,\n" +
            "    \"GroupAdd\": null,\n" +
            "    \"IpcMode\": \"private\",\n" +
            "    \"Cgroup\": \"\",\n" +
            "    \"Links\": null,\n" +
            "    \"OomScoreAdj\": 0,\n" +
            "    \"PidMode\": \"\",\n" +
            "    \"Privileged\": true,\n" +
            "    \"PublishAllPorts\": false,\n" +
            "    \"ReadonlyRootfs\": false,\n" +
            "    \"SecurityOpt\": [\n" +
            "      \"label=disable\"\n" +
            "    ],\n" +
            "    \"UTSMode\": \"\",\n" +
            "    \"UsernsMode\": \"\",\n" +
            "    \"ShmSize\": 67108864,\n" +
            "    \"Runtime\": \"runc\",\n" +
            "    \"ConsoleSize\": [\n" +
            "      0,\n" +
            "      0\n" +
            "    ],\n" +
            "    \"Isolation\": \"\",\n" +
            "    \"CpuShares\": 0,\n" +
            "    \"Memory\": 0,\n" +
            "    \"NanoCpus\": 0,\n" +
            "    \"CgroupParent\": \"\",\n" +
            "    \"BlkioWeight\": 0,\n" +
            "    \"BlkioWeightDevice\": [],\n" +
            "    \"BlkioDeviceReadBps\": null,\n" +
            "    \"BlkioDeviceWriteBps\": null,\n" +
            "    \"BlkioDeviceReadIOps\": null,\n" +
            "    \"BlkioDeviceWriteIOps\": null,\n" +
            "    \"CpuPeriod\": 0,\n" +
            "    \"CpuQuota\": 0,\n" +
            "    \"CpuRealtimePeriod\": 0,\n" +
            "    \"CpuRealtimeRuntime\": 0,\n" +
            "    \"CpusetCpus\": \"\",\n" +
            "    \"CpusetMems\": \"\",\n" +
            "    \"Devices\": [],\n" +
            "    \"DeviceCgroupRules\": null,\n" +
            "    \"DeviceRequests\": null,\n" +
            "    \"KernelMemory\": 0,\n" +
            "    \"KernelMemoryTCP\": 0,\n" +
            "    \"MemoryReservation\": 0,\n" +
            "    \"MemorySwap\": 0,\n" +
            "    \"MemorySwappiness\": null,\n" +
            "    \"OomKillDisable\": false,\n" +
            "    \"PidsLimit\": null,\n" +
            "    \"Ulimits\": null,\n" +
            "    \"CpuCount\": 0,\n" +
            "    \"CpuPercent\": 0,\n" +
            "    \"IOMaximumIOps\": 0,\n" +
            "    \"IOMaximumBandwidth\": 0,\n" +
            "    \"MaskedPaths\": null,\n" +
            "    \"ReadonlyPaths\": null\n" +
            "  },\n" +
            "  \"GraphDriver\": {\n" +
            "    \"Data\": {\n" +
            "      \"LowerDir\": \"/var/lib/docker/overlay2/7853772e3128009df0f1034faaa691720439901304cb1c0906521f02894f80f9-init/diff:/var/lib/docker/overlay2/1987466721da4e01da4b4ae4ec59231dba2371e56674db34333d4b0f3da3782c/diff:/var/lib/docker/overlay2/100cfe89d64e2008741a5a7df1976f776b068316c258ea3ff0b25fe4e84b2867/diff:/var/lib/docker/overlay2/8f574f1aedc2ba9fac3db4627f26686bc1e97679324b75f9055ed5df8954accf/diff:/var/lib/docker/overlay2/5016463c49b522b5da9953aa2801de27ba13e39680fb7e4d7c3479ebc65e1b60/diff:/var/lib/docker/overlay2/bb629bf4a21a74e28240b056757b09853663e6bd70ae1efa534ef9eb3668f4d7/diff:/var/lib/docker/overlay2/c499b3cd177f2961ef7e89b48e42623e1113ee4f19e335c2236a9aa7acf6c0f3/diff:/var/lib/docker/overlay2/45f18294fe1f2c82568fc7d32a31177994610c5131292a8a0fface1de0da2803/diff:/var/lib/docker/overlay2/24e0008bf4b059eb554e0be0ce9de489f8fc5d9e95626a34754d2d403787286d/diff:/var/lib/docker/overlay2/62a43256862f980fe2a5ba8a1a4a3c6c40b9bde2091035c15ba33285439aa91b/diff\",\n" +
            "      \"MergedDir\": \"/var/lib/docker/overlay2/7853772e3128009df0f1034faaa691720439901304cb1c0906521f02894f80f9/merged\",\n" +
            "      \"UpperDir\": \"/var/lib/docker/overlay2/7853772e3128009df0f1034faaa691720439901304cb1c0906521f02894f80f9/diff\",\n" +
            "      \"WorkDir\": \"/var/lib/docker/overlay2/7853772e3128009df0f1034faaa691720439901304cb1c0906521f02894f80f9/work\"\n" +
            "    },\n" +
            "    \"Name\": \"overlay2\"\n" +
            "  },\n" +
            "  \"Mounts\": [\n" +
            "    {\n" +
            "      \"Type\": \"bind\",\n" +
            "      \"Source\": \"/mydata/nacos/conf/application.properties\",\n" +
            "      \"Destination\": \"/home/nacos/conf/application.properties\",\n" +
            "      \"Mode\": \"\",\n" +
            "      \"RW\": true,\n" +
            "      \"Propagation\": \"rprivate\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Type\": \"bind\",\n" +
            "      \"Source\": \"/mydata/nacos/logs\",\n" +
            "      \"Destination\": \"/home/nacos/logs\",\n" +
            "      \"Mode\": \"\",\n" +
            "      \"RW\": true,\n" +
            "      \"Propagation\": \"rprivate\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"Config\": {\n" +
            "    \"Hostname\": \"4b7da3f60165\",\n" +
            "    \"Domainname\": \"\",\n" +
            "    \"User\": \"\",\n" +
            "    \"AttachStdin\": false,\n" +
            "    \"AttachStdout\": false,\n" +
            "    \"AttachStderr\": false,\n" +
            "    \"ExposedPorts\": {\n" +
            "      \"8848/tcp\": {}\n" +
            "    },\n" +
            "    \"Tty\": false,\n" +
            "    \"OpenStdin\": false,\n" +
            "    \"StdinOnce\": false,\n" +
            "    \"Env\": [\n" +
            "      \"PREFER_HOST_MODE=hostname\",\n" +
            "      \"JVM_XMS=128m\",\n" +
            "      \"JVM_XMX=128m\",\n" +
            "      \"MODE=standalone\",\n" +
            "      \"PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin\",\n" +
            "      \"BASE_DIR=/home/nacos\",\n" +
            "      \"CLASSPATH=.:/home/nacos/conf:\",\n" +
            "      \"CLUSTER_CONF=/home/nacos/conf/cluster.conf\",\n" +
            "      \"FUNCTION_MODE=all\",\n" +
            "      \"JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk\",\n" +
            "      \"NACOS_USER=nacos\",\n" +
            "      \"JAVA=/usr/lib/jvm/java-1.8.0-openjdk/bin/java\",\n" +
            "      \"JVM_XMN=512m\",\n" +
            "      \"JVM_MS=128m\",\n" +
            "      \"JVM_MMS=320m\",\n" +
            "      \"NACOS_DEBUG=n\",\n" +
            "      \"TOMCAT_ACCESSLOG_ENABLED=false\",\n" +
            "      \"TIME_ZONE=Asia/Shanghai\"\n" +
            "    ],\n" +
            "    \"Cmd\": null,\n" +
            "    \"Image\": \"nacos/nacos-server:latest\",\n" +
            "    \"Volumes\": null,\n" +
            "    \"WorkingDir\": \"/home/nacos\",\n" +
            "    \"Entrypoint\": [\n" +
            "      \"bin/docker-startup.sh\"\n" +
            "    ],\n" +
            "    \"OnBuild\": null,\n" +
            "    \"Labels\": {\n" +
            "      \"org.label-schema.schema-version\": \"= 1.0     org.label-schema.name=CentOS Base Image     org.label-schema.vendor=CentOS     org.label-schema.license=GPLv2     org.label-schema.build-date=20180531\",\n" +
            "      \"org.opencontainers.image.created\": \"2021-07-31T10:05:17.868Z\",\n" +
            "      \"org.opencontainers.image.description\": \"This project contains a Docker image meant to facilitate the deployment of Nacos .\",\n" +
            "      \"org.opencontainers.image.licenses\": \"\",\n" +
            "      \"org.opencontainers.image.revision\": \"3ecf3cd381938b61cbb4d565dd7f1cc2320ea5ee\",\n" +
            "      \"org.opencontainers.image.source\": \"https://github.com/nacos-group/nacos-docker\",\n" +
            "      \"org.opencontainers.image.title\": \"nacos-docker\",\n" +
            "      \"org.opencontainers.image.url\": \"https://github.com/nacos-group/nacos-docker\",\n" +
            "      \"org.opencontainers.image.version\": \"v2.0.3\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"NetworkSettings\": {\n" +
            "    \"Bridge\": \"\",\n" +
            "    \"SandboxID\": \"d6c1a36c2dae79a23e308a7f37b79a941b5dcacf6068457018298310b80048d7\",\n" +
            "    \"HairpinMode\": false,\n" +
            "    \"LinkLocalIPv6Address\": \"\",\n" +
            "    \"LinkLocalIPv6PrefixLen\": 0,\n" +
            "    \"Ports\": {\n" +
            "      \"8848/tcp\": [\n" +
            "        {\n" +
            "          \"HostIp\": \"0.0.0.0\",\n" +
            "          \"HostPort\": \"8848\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"HostIp\": \"::\",\n" +
            "          \"HostPort\": \"8848\"\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    \"SandboxKey\": \"/var/run/docker/netns/d6c1a36c2dae\",\n" +
            "    \"SecondaryIPAddresses\": null,\n" +
            "    \"SecondaryIPv6Addresses\": null,\n" +
            "    \"EndpointID\": \"5daab738b89a6bb8bd9e2d8e1f40f074815120f6f7fd5b9c7240afad7103775b\",\n" +
            "    \"Gateway\": \"172.17.0.1\",\n" +
            "    \"GlobalIPv6Address\": \"\",\n" +
            "    \"GlobalIPv6PrefixLen\": 0,\n" +
            "    \"IPAddress\": \"172.17.0.2\",\n" +
            "    \"IPPrefixLen\": 16,\n" +
            "    \"IPv6Gateway\": \"\",\n" +
            "    \"MacAddress\": \"02:42:ac:11:00:02\",\n" +
            "    \"Networks\": {\n" +
            "      \"bridge\": {\n" +
            "        \"IPAMConfig\": null,\n" +
            "        \"Links\": null,\n" +
            "        \"Aliases\": null,\n" +
            "        \"NetworkID\": \"8216069ee6a76643ea17282a34e7c0afc7ff882a31ad81156944f010ef874e8c\",\n" +
            "        \"EndpointID\": \"5daab738b89a6bb8bd9e2d8e1f40f074815120f6f7fd5b9c7240afad7103775b\",\n" +
            "        \"Gateway\": \"172.17.0.1\",\n" +
            "        \"IPAddress\": \"172.17.0.2\",\n" +
            "        \"IPPrefixLen\": 16,\n" +
            "        \"IPv6Gateway\": \"\",\n" +
            "        \"GlobalIPv6Address\": \"\",\n" +
            "        \"GlobalIPv6PrefixLen\": 0,\n" +
            "        \"MacAddress\": \"02:42:ac:11:00:02\",\n" +
            "        \"DriverOpts\": null\n" +
            "      }\n" +
            "    }\n" +
            "  }\n" +
            "}";

    public String getJson() {
        return json;
    }
}
