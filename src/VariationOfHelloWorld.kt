fun main(args: Array<String>) {
    //if we want we can read parameters

    if (args.size == 0) {
        println("Please provide a name as a command line argument")

    }

    //pass argument using run --> edit configuration
    println("Hello ${args[0]} !")

}