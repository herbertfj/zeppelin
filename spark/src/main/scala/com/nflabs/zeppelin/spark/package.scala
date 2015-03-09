package com.nflabs.zeppelin

package object spark {

  def printTable(a: Any): Unit = {
    println("%table " + a)
  }

}
