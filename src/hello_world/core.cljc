(ns hello-world.core
  (:require [clojure.spec.alpha :as s])
  #?(:clj (:gen-class)))

(defn -main
  [& args]
  (println "Hello, World!")
  (println (s/valid? any? "Hello, World!")))

#?(:cljs (set! *main-cli-fn* -main))