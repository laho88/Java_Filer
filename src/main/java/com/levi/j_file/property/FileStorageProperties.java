

package com.levi.j_file.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
    private String uploadDir;

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}

//Dev Notes:

//@ConfigurationProperties(prefix = "file") annotation binds all the properties using "file" prefix found in application.properties to the corresponding fields of the POJO class.
//
//TO ADD more file properties, add a corresponding field in the above class, and spring boot will automatically bind the field with the property value.