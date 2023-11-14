package main

import (
	"log"
	"math/rand"
	"net/http"
	"os"
	"runtime"
	"strconv"

	"github.com/gorilla/mux"
	"github.com/mahfuzsust/bazel/projects/go_calculator"
)

func RestHandler(w http.ResponseWriter, r *http.Request) {
	log.Println("Received request")
	a := rand.Intn(100)
	b := rand.Intn(100)
	w.Write([]byte("Sum of " + strconv.Itoa(a) + " and " + strconv.Itoa(b) + " = " + strconv.Itoa(go_calculator.Add(a, b))))
	w.Write([]byte("\nSubtract of " + strconv.Itoa(a) + " and " + strconv.Itoa(b) + " = " + strconv.Itoa(go_calculator.Subtract(a, b))))
}

func getPort() string {
	port := os.Getenv("PORT")
	if port == "" {
		return "8080"
	}

	return port
}

func main() {
	r := mux.NewRouter()
	r.HandleFunc("/", RestHandler)
	port := getPort()
	log.Println("running program's operating system target: " + runtime.GOOS)
	log.Println("running program's architecture target: " + runtime.GOARCH)
	log.Println("Going to listen on port: " + port)
	log.Fatal(http.ListenAndServe(":"+port, r))
}
