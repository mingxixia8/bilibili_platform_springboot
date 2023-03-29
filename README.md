# bilibili_platform_springboot
部署环境：
JDK 8
Springboot 2.5.1
Maven intelliJ默认自带版本（未单独下载）

可能出现的问题：

1.java版本与Springboot不匹配： 降级Springboot到2.5.1, 降级之前确保pom.xml文件中有Maven远程仓库配置，配置之后springboot版本可以自动下载。

  <repositories>
      <repository>
          <id>central</id>
          <url>https://repo.maven.apache.org/maven2</url>
          <snapshots>
              <enabled>false</enabled>
          </snapshots>
      </repository>
  </repositories>

2. 某个jar文件损坏
  在文件夹中删除jar文件之后，右键项目pom.xml 选择Maven 选择下载Source and Document，会自动重载Maven。


