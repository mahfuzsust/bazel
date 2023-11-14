# Bazel 
A Monorepo project managed by Bazel. Added technologies
* Python
* Go
* Java

### Build
```
bazel build //...
```

## Java

### Build

```
bazel build //projects/java-prime/src/main/java/info/mahfuz
bazel build //projects/java-random/src/main/java/info/mahfuz
```

### Dependency
```
bazel query  --notool_deps --noimplicit_deps "deps(//projects/java-prime/src/main/java/info/mahfuz)" --output graph
```

### Run

```
bazel run //projects/java-prime/src/main/java/info/mahfuz
bazel run //projects/java-random/src/main/java/info/mahfuz
```

### Release 

We can create single release jar with all the dependencies by running build command with `_deploy.jar` added

```
bazel build //projects/java-prime/src/main/java/info/mahfuz:mahfuz_deploy.jar
java -jar bazel-bin/projects/java-prime/src/main/java/info/mahfuz/mahfuz_deploy.jar
```

## Go

Run project
```
bazel run //projects/go_web
```

### Clean

Clean bazel 
```
bazel clean
```
