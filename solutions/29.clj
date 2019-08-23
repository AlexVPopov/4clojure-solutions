; version 1

#(clojure.string/join (re-seq #"[A-Z]" %))

; version 2

#(apply str (re-seq #"[A-Z]" %))
