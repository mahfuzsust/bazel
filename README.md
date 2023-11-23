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

## Python

Run project
```
bazel run //projects/py_calculator:calculator_web
```

### Clean

Clean bazel 
```
bazel clean
```

## Remote caching

Run the docker image
```
docker run -u 1000:1000 -v ~/Desktop/remote-cache:/data -p 9090:8080 -p 9092:9092 buchgr/bazel-remote-cache --max_size 5
```

And then run the build and test using `--remote_cache`. There are two endpoint available to the image
1. 9090 for http (`--remote_cache=http://localhost:9090`)
2. 9092 for grpc (`--remote_cache=grpc://localhost:9092`)