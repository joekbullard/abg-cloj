(ns abg-web.main
  (:require
   [abg-web.system :as system]))

(defn -main []
  (system/start-system))
