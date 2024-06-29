(ns notebooks.clojure
  (:require [tablecloth.api :as tc]
            [scicloj.noj.v1.vis.hanami :as hanami]
            [aerial.hanami.templates :as ht]
            [scicloj.kindly.v4.kind :as kind]))

;; # Clojure

;; > Clojure is a dynamic, general-purpose programming language, combining the approachability and interactive development of a scripting language with an efficient and robust infrastructure for multithreaded programming.

;; [source](https://clojure.org/)

;; Cloure's official website has a really well and thorough documentation section.
;; Because of that there isn't really a need for me to go over it again.

;; That being said, I am learning Clojure myself so I will be putting down examples of every primitive that makes up the language itself

;; ## Numbers

1
1000
-1
0.3
1/4

;; A symbol is a reference to something else like a function, a value, a namespace, etc. Symbols can have a namespace, separated with a forward slash from the boolean values.

;; In a language like Ruby symbols are basically a frozen string, whereas in Cloure they are a reference to something else

;; Keywords on the other hand start leading with a colon and always evaluate themselves

;; ## Collections

;; Clojure has 4 core collection types

'(1 2 3) ; list
[1 2 3] ; vector
#{1 10 19} ; set
{:a 1, :b 2} ; map

;; Clojure offers delaying the evaluation of an expression
;; with the use of a quote before the expression

'not-defined-but-wont-break-as-its-not-evaluated

;; ## REPL, explorations & interactive programming

;; Clojure's REPL works the same as any other REPL out there
;; a user types in instructions on a buffer which is then immediately evaluated.
;; One may load a namespace onto the REPL to access functions defined in a codebase

(+ 4 1)

;; Now onto one of my favourite features. [Interactive programming](https://docs.cider.mx/cider/usage/interactive_programming.html)

;; Clojure has some really tight integrations with some text editors like Emacs, put together with tools like CIDER an interactive REPL server, you can write key binding commands that immediately evaluate code on a file, line by line, section by section or namespace by namespace and immediately display it on the browser or a terminal buffer, without you having to ever leave the `INSERT` mode from that file. Here's a step-by-step example of my workflow for writing this book:

;; - I open a file in emacs, mine uses the [corgi](https://github.com/corgi-emacs/corgi) flavour, using the key bindings `SPC` + `F` + `$filename`
;; - The file is displayed onto the screen. I am using emacs on evil mode so I type in `a` to start `INSERT` mode.
;; - I type in some code. e,g: `(+ 1 2 3)`
;; - I exit `INSERT` mode by pressing `ESC`
;; - I boot and connect to a CIDER server by invoking the command `SPC` + `j` + `j`
;; - The server boots and a prompt appears on emacs displaying the host, port, etc.
;; I drop the cursor onto the closing parenthesis of the code and invoke the command `SPC` + `e` + `e`. In this case that combo of keys is bound to the emacs command `eval-form-before-cursor` which evaluates the code and displays it on the REPL
;; - I can now visualise my code as I go

;; In this example I went for something simple like a function with 3 arguments, but the possibilities are endless. If you go back to earlier chapters in the book you can see the amount of code that I needed to render a 3D chart using Plotly. This creates a super tight feedback loop which is close to codewatching solutions(watchman, guard, etc)

;; At any time I can just type in `SPC` + `SPC` and a search bar will pop up like Apple's spotlight search where I can look up any function loaded onto my emacs. That includes from changing the cursor from blink mode or not all the way to using Spotify & email.

;; ## Functions

;; ### Multi arity functions

;; ### Rest/split functions

;; ### `defn` vs `fn`

;; ## Applying functions

;; ### `apply`

;; ## Locals & closures

;; ### `let`

;; ### `defn`

;; ### Closures

;; ## Java Interoperability

;; ## Sequential collections

;; ### Vectors

;; ### Lists

;; ## Hashed collections

;; ### Sets

;; ### Maps

;; ### Representing domain data

;; ## Flow control

;; ### Statements vs expressions

;; ### Flow control expressions

;; ## Recursion

;; ## Exceptions

;; ## Namespaces

;; ### Declaring namespaces

;; ### Java classes and imports
