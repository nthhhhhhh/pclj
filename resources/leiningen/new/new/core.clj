(ns {{name}}.core
  (:import [processing.core PApplet]
           [processing.event MouseEvent])
  (:gen-class
   :name {{name}}.MySketch
   :extends processing.core.PApplet))

(defn -settings
  [this])

(defn -setup
  [this])

(defn -draw
  [this])

(defn -mousePressed
  [this ^MouseEvent _])

(defn -main
  []
  (PApplet/runSketch (into-array java.lang.String ["MySketch"]) ({{name}}.MySketch.)))

