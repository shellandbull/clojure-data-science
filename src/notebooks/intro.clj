(ns notebooks.intro
  (:require [tablecloth.api :as tc]
            [scicloj.metamorph.ml.toydata :as data]
            [scicloj.kindly.v4.kind :as kind]))

;; # Introduction | Clojure & Data Science

;; > Data science is an interdisciplinary academic field[1] that uses statistics, scientific computing, scientific methods, processes, scientific visualization, algorithms and systems to extract or extrapolate knowledge and insights from potentially noisy, structured, or unstructured data.

;; [Source: Wikipedia](https://en.wikipedia.org/wiki/Data_science)

;; ## Why Clojure?

;; I started programming when I was about 14 years old, at the time I had gotten an internship at a startup which was building on Ruby/Rails. I told the CTO at the time that I wanted to learn too and he handed over the legendary
;; [Michael Hartl's Ruby on Rails guide](https://www.railstutorial.org/). I was stoked and completely failed at it, but I gained a bit of experience

;; Fast forward to 2014, I enrolled onto [Makers Academy](https://makers.tech/) where I finished a Ruby/Rails bootcamp under the coaching of [Evgeny Shadchnev](https://www.evgeny.coach/), who in one of our sessions talked about
;; [LISP](https://lisp-lang.org/) dialects and more specifically [Clojure](https://clojure.org/). There's a ton of things that make Clojure awesome, here's a few:

;; - Runs on the [JVM](https://en.wikipedia.org/wiki/Java_virtual_machine) so you can access a large ecosystem of libraries
;; - Supports [Java interoperability out of the box](https://clojure.org/reference/java_interop)
;; - Dynamically typed
;; - Functional

;; That being said, I would not say Clojure is a beginner friendly platform, it can very powerful once mastered but I suggest having prior programming experience before picking something like Clojure. A good way to explore a
;; language's suitability to your preference is to perform little code exercises. I personally like to use [Codewars](https://www.codewars.com)

;; ## Why data science?

;; [Data is the new oil](https://www.economist.com/leaders/2017/05/06/the-worlds-most-valuable-resource-is-no-longer-oil-but-data)

;; Just like Data science is an interdisciplinary field, there's a few :key: reasons why I decided to go down this route

;; **It sits close to software engineering**. A lot of my skills as a software engineer do extrapolate, specially when it comes to data engineering, ops/cloud work, etc.

;; **A promise to a better work/life balance**. Software engineers are often times pushed onto delivering new features as we predominantly worked on businesses funded by investment and not revenue. Over time I have come to terms
;; with the fact that this is the nature of my industry. It does not mean that is healthy by any means. It has definitely improved in the recent years but with a hard recession in tech looming over, we are going to start seeing
;; a lot of it coming back.

;; **Better pay**. Slightly contested, but it looks like salaries in machine learning & data science are about the same for software engineering without the pressure that comes with software engineering

;; ## Methodology

;; How am I writing this book? Well, I was inspired by a talk on [London Clojurians](https://www.youtube.com/watch?v=eUFf3-og_-Y) where the [scicloj stack](https://scicloj.github.io/) was displayed, coming from a workflow where I have a terminal on one
;; side of the screen and my text editor on the other one, and having to either navigate to the browser to check a server or make a staging deployment, I found this new approach super refreshing as it tightens the feedback loop
;; one gets when writing programs. It works as follows:

;; - Provision a text editor with key bindings to an IDE that can run Clojure. I am using the [corgi](https://github.com/corgi-emacs/corgi) flavour of emacs & [CIDER](https://cider.mx/)
;; - Setup a project that has data manipulation & visualisation libraries. I am using [tablecloth](https://github.com/scicloj/tablecloth), [clay](https://github.com/scicloj/clay) & [kindly](https://github.com/scicloj/kindly)
;; - You can now write code from your text editor and evaluate it in the editor itself to visualise and manipulate information, the same way you'd do with a Jupyter Notebook

;; ## Demo

;; This file itself is a great demo of the stack. The markdown rendered text is actually code comments in a Clojure file and all Clojure code is evaluated and rendered onto the document itself

;; Here's an example dataset displaying passenger data from The Titanic

(->
 (data/titanic-ds-split)
 :train
 (tc/dataset)
 (tc/head 10))

;; And here's a demo of visualising a chart using [Plotly](https://plotly.com/)

(def plotly-example
  {:data [{:x [0 1 3 2]
           :y [0 6 4 5]
           :z [0 8 9 7]
           :type :scatter3d
           :mode :lines+markers
           :opacity 0.5
           :line {:width 5}
           :marker {:size 4
                    :colorscale :Viridis}}]
   :layout {:title "Plotly example"}})

(kind/plotly
 plotly-example)
