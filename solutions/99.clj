(fn [& args]
  (map (comp read-string str)
       (str (apply * args))))
