/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.metatron.discovery.domain.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "polaris.storage")
public class StorageProperties {

  public enum StorageType{
    STAGEDB
  }

  StageDBConnection stagedb;

  public StorageProperties() {
  }

  public StageDBConnection getStagedb() {
    return stagedb;
  }

  public void setStagedb(StageDBConnection stagedb) {
    this.stagedb = stagedb;
  }

  public static class StageDBConnection implements Serializable {
    String hostname;
    Integer port;
    String username;
    String password;
    String url;
    String metastoreUri;
    boolean strictMode;
    String metastoreHost;
    String metastorePort;
    String metastoreSchema;
    String metastoreUserName;
    String metastorePassword;

    public String getHostname() {
      return hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }

    public Integer getPort() {
      return port;
    }

    public void setPort(Integer port) {
      this.port = port;
    }

    public String getUsername() {
      return username;
    }

    public void setUsername(String username) {
      this.username = username;
    }

    public String getPassword() {
      return password;
    }

    public void setPassword(String password) {
      this.password = password;
    }

    public String getUrl() {
      return url;
    }

    public void setUrl(String url) {
      this.url = url;
    }

    public String getMetastoreUri() {
      return metastoreUri;
    }

    public void setMetastoreUri(String metastoreUri) {
      this.metastoreUri = metastoreUri;
    }

    public boolean isStrictMode() {
      return strictMode;
    }

    public void setStrictMode(boolean strictMode) {
      this.strictMode = strictMode;
    }

    public String getMetastoreHost() {
      return metastoreHost;
    }

    public void setMetastoreHost(String metastoreHost) {
      this.metastoreHost = metastoreHost;
    }

    public String getMetastorePort() {
      return metastorePort;
    }

    public void setMetastorePort(String metastorePort) {
      this.metastorePort = metastorePort;
    }

    public String getMetastoreSchema() {
      return metastoreSchema;
    }

    public void setMetastoreSchema(String metastoreSchema) {
      this.metastoreSchema = metastoreSchema;
    }

    public String getMetastoreUserName() {
      return metastoreUserName;
    }

    public void setMetastoreUserName(String metastoreUserName) {
      this.metastoreUserName = metastoreUserName;
    }

    public String getMetastorePassword() {
      return metastorePassword;
    }

    public void setMetastorePassword(String metastorePassword) {
      this.metastorePassword = metastorePassword;
    }
  }
}
