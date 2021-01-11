## Computer API
##### Description
*Is your computer turned on? Find it out with this API*
##### Usage
```java
package com.github.cemicyz.computerapi;

final class Sample {

    /*
    Is your computer turned on? Find it out with this API
    */

    public static void main(String[] args) {
        System.out.println("Computer is : " + (ComputerAPI.isOn() ? "on" : "off"));
    }
}
```
##### Maven
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.cemicyz</groupId>
    <artifactId>computer-api</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```
##### Gradle
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
        implementation 'com.github.cemicyz:computer-api:Tag'
}
```