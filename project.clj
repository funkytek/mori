(defproject mori "0.1.0-SNAPSHOT"
  :description "Persistent Data Structures for JavaScript"
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :dev-dependencies [[lein-cljsbuild "0.1.9"]]
  :extra-classpath-dirs ["checkouts/clojurescript/src/clj"
                         "checkouts/clojurescript/src/cljs"]
  :cljsbuild {:builds {:tmp {:source-path "src"
                             :compiler {:optimizations :advanced
                                        :output-to "tmp.js"}}
                       :dev {:source-path "src"
                             :compiler {:optimizations :whitespace
                                        :output-to "mori.js"}}
                       :release {:source-path "src"
                                 :compiler {:optimizations :advanced
                                            :output-to "mori-min.js"}}}})
