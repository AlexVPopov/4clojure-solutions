; version 1

#(cond
   (< (count %) 2) true
   (not= (first %) (last %)) false
   :else (recur (-> % rest butlast)))

; version 2

#(= (seq %) (reverse %))
