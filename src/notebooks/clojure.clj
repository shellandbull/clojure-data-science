(ns notebooks.clojure
  (:require [tablecloth.api :as tc]
            [scicloj.noj.v1.vis.hanami :as hanami]
            [aerial.hanami.templates :as ht]
            [scicloj.kindly.v4.kind :as kind]))

;; # Clojure

;; > Clojure is a dynamic, general-purpose programming language, combining the approachability and interactive development of a scripting language with an efficient and robust infrastructure for multithreaded programming.

;; [source](https://clojure.org/)

;; ## Literals

"I am a string"
#"[0-9]" ;; a regex

;; Numeric types

51
-1.5
1/4

;; ## Symbols

;; A symbol is a reference to something else like a function, a value, a namespace, etc. Symbols can have a namespace, separated with a forward slash from the boolean values.

;; In a language like Ruby symbols are basically a frozen string, whereas in Cloure they are a reference to something else

;; Keywords on the other hand start leading with a colon and always evaluate themselves

map
+
clojure.string/blank?
nil
:alpha
:foo/bar

;; ## Collections

;; Clojure has 4 core collection types

;; list
(10 10 10 9)

;; vector
[20 10 1960]

;; set
#{6 5 4 2 10}

;; map
{:a 1, :b 2}

;; ## Delayed evaluation

;; Clojure offers delaying the evaluation of an expression
;; with the use of a quote before the expression

;;

;; ## REPL, explorations & interactive programming

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
