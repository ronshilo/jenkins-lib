def call(String name = 'human', String lastname = 'ron' ) {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    echo "Hello, ${name} ${lastname} ."
}
