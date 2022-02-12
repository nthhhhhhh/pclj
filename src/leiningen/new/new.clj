(ns leiningen.new.new
  (:require [leiningen.new.templates :as tmpl]
            [leiningen.core.main :as main]))

(def render (tmpl/renderer "new"))

(defn new
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (tmpl/name-to-path name)}]
    (main/info "Generating fresh 'lein new' pclj/new project.")
    (tmpl/->files data
                  ["project.clj"                (render "project.clj" data)]
                  ["src/{{sanitized}}/core.clj" (render "core.clj" data)])))
