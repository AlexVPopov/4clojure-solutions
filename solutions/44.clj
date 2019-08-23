; version 1

#(->> (cycle %2) 
      (drop (if (pos? %) 
              % 
              (-> % Math/abs inc))) 
      (take (count %2)))

; version 2 - for explanation, see modulo of a negative 
; number: https://www.youtube.com/watch?v=VJ-5R1qYRDE

#(->> (cycle %2) 
      (drop (mod % (count %2))) 
      (take (count %2)))

; version 3

#(let [rot (mod %1 (count %2))]
   (concat (drop rot %2) 
           (take rot %2)))
