(defproject jepsen.credis "0.1.0-SNAPSHOT"
  :description "Jepsen tests for credis"
  :url "http://github.com/graysonchao/jepsen.credis"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main jepsen.credis
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [jepsen "0.1.8"]
                 [verschlimmbesserung "0.1.3"]])
