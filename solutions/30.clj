; version 1

(fn deduper
  [x]
  (cond
    (= 1 (count x)) x
    (= (first x) (second x)) (deduper (cons (first x) (nthrest x 2)))
    :else (cons (first x) (deduper (rest x)))))

; version 2

#(map first (partition-by identity %))
