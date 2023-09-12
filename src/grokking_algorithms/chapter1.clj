(ns grokking-algorithms.chapter1)

(defn busca-completa [valor-desejado lista-inicial]
  (loop [lista lista-inicial]
    (println lista)
    (if (empty? lista)
      nil
      (if (= valor-desejado (first lista))
        (first lista)
        (recur (rest lista))))))


(busca-completa 6 [1 2 3 4 5 6 7])

(defn busca-binaria [valor-desejado lista-inicial]
  (loop [lista lista-inicial]
    (println lista)
    (when not-empty (lista)
          (let [meio-lista (/ (count lista) 2)
                elemento-meio (nth lista meio-lista)]
            (cond
              (= elemento-meio valor-desejado) elemento-meio
              (> elemento-meio valor-desejado) (recur (subvec lista (inc meio-lista)))
              (< elemento-meio valor-desejado) (recur (subvec lista 0 (dec meio-lista))))))))

(busca-binaria 6 [1 2 3 4 5 6 7 8 9])