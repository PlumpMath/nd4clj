(defproject clj-nd4j "0.1.0-SNAPSHOT"
  :description "An implementation of core.matrix protocols with nd4j."
  :url "https://github.com/whilo/clj-nd4j"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [net.mikera/core.matrix "0.36.1"]
                 [net.mikera/core.matrix.testing "0.0.4"]
                 [org.nd4j/nd4j-jblas "0.0.3.5.5.5"]
                 #_[org.nd4j/jcublas "6.5"]
                 #_[org.nd4j/nd4j-jcublas-6.5 "0.0.3.5.5.6-SNAPSHOT"]])
