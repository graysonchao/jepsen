(ns jepsen.disque-test
  (:require [clojure.test :refer :all]
            [clojure.pprint :refer [pprint]]
            [jepsen [core :as jepsen]
                    [disque :as disque]
                    [report :as report]]))

(deftest basic
  (let [test (jepsen/run! (disque/basic-queue-test))]
    (is (:valid? (:results test)))))
