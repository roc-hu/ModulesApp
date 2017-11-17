#   常用设置

##  Gradle配置

####  设置java版本


<p>如果是在某个module中设置，那么就在其build.gradle中配置：</p>

<pre><code>
android {
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_7
        targetCompatibility JavaVersion.VERSION_1_7
    }
}
</code></pre>

<p>如果想要做全局配置，那么就在根目录的build.gradle中配置：</p>

<pre><code>
allprojects {
    repositories {
        jcenter()
    }
    tasks.withType(JavaCompile) {
        sourceCompatibility = JavaVersion.VERSION_1_7
        targetCompatibility = JavaVersion.VERSION_1_7
    }
}
</code></pre>