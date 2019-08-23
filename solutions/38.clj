; version 1

(fn my-max
  [& args]
  (reduce #(if (> % %2) % %2) args))

; version 2

#(-> %& sort last)
