(fn [set-1 set-2]
  (clojure.set/union (clojure.set/difference set-1 set-2) (clojure.set/difference set-2 set-1)))
