; version 1

#(reduce (fn [acc e] (update acc e (fn [count] (if (nil? count) 1 (inc count))))) {} %)

; version 2

#(reduce (fn [acc e] (assoc acc e (inc (get acc e 0)))) {} %)
