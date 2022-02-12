(def home (System/getenv "HOME"))
(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :plugins [[cider/cider-nrepl "0.27.2"]]
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [cider/cider-nrepl "0.24.0"]]
  :resource-paths #=(eval
                     (mapv #(str home %)
                           ["/Applications/Processing.app/Contents/Java/core/library/core.jar"
                            "/Applications/Processing.app/Contents/Java/core/library/"]))
  :main {{name}}.core
  :aot :all
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
