(ns index
  (:require [tablecloth.api :as tc]
            [scicloj.noj.v1.vis.hanami :as hanami]
            [aerial.hanami.templates :as ht]
            [scicloj.kindly.v4.kind :as kind]))

;; # Clojure for data science

;; Welcome! My name is Mario Gintili and this Quarto book is a self-documenting learning journey in the chasm of data science and machine learning.

;; I have a background in software engineering with Ruby/Rails & Node.js.

;; I was really impressed by the [scicloj](https://scicloj.github.io/) tech stack. It's the toolset I'll be using for this exploration.

;; Without further ado, here's the syllabus that was kindly given to me by a colleague and fellow member of the community

;; - Introduction to Data Science & Clojure
;; - Intro to Clojure syntax, data structures, functions
;; - Setting up Clojure development environment
;; - Math & Stats Fundamental
;; - Probability theory, distributions, hypothesis testing
;; - Linear algebra basics (vectors, matrices, operations)
;; - Descriptive statistics, exploratory data analysis
;; - Exercises: Probability problems, basic data analysis
;; - Data Manipulation with Clojure
;; - Clojure sequences, collections, and data operations
;; - Intro to Clojure libs (tablecloth, hanami, fastmath, tech.ml.dataset)
;; - Data cleaning, merging, reshaping datasets
;; - Project: Clean and wrangle a dataset
;; - Data Visualization
;; - Principles of data visualization (Tufte, Wilkinson)
;; - Using oz, Vega/Vega-Lite libs for plots in Clojure
;; - Using plotly
;; - Creating common plots: Scatter, line, bar, histograms
;; - Project: Explore and visualize a dataset
;; - Statistical Models & Regression
;; - Simple/multiple linear regression
;; - Model fitting, evaluation metrics
;; - Case study: Predicting housing prices
;; - Classification
;; - Logistic regression, evaluation metrics
;; - Decision trees, random forests
;; - Case study: Spam classification
;; - Feature Engineering, Clustering & Dimensionality Reduction
;; - K-means clustering
;; - Principal Component Analysis (PCA)
;; - Case study: Customer segmentation
;; - Databases & Big Data
;; - Intro to databases (SQL, NoSQL, graph)
;; - Big data concepts (MapReduce, Spark, Hadoop)
;; - Project: Analyze data from a database
;; - Natural Language Processing
;; - Text data preprocessing
;; - Topic modeling, sentiment analysis
;; - Project: Analyze text data (reviews, tweets, stock market commentary, etc)
;; - Time Series & Forecasting
;; - Trend, seasonality, autocorrelation
;; - ARIMA, exponential smoothing models
;; - Case study: Forecast product demand
;; - Recommendation Systems
;; - Collaborative filtering
;; - Matrix factorization techniques
;; - Project: Build a recommendation engine
;; - Deep Learning
;; - Pytorch
;; - Tensorflow
;; - MLOps
;; - MLFlow
;; - Modern practises, storing and managing models, AWS sagemaker
;; - Stable diffusion
;; - Applications & Final Project
;; - Putting it all together: End-to-end case studies
;; - Individual final project on data science problem, maybe stock market
