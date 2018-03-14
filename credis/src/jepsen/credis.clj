(ns jepsen.credis
  (:require [jepsen.cli :as cli]
            [jepsen.tests :as tests]))

(defn credis-test
  "Given an options map from the command line runner (:nodes, :concurrency, :ssh...),
  constructs a test map."
  [opts]
  (merge tests/noop-test
         opts))

(defn -main
  "Handles command line arguments. Can either run a test, or a web server for
  browsing results."
  [& args]
  (cli/run! (cli/single-test-cmd {:test-fn credis-test})
                        args))


