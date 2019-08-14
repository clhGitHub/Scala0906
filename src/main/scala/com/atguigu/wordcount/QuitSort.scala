package com.atguigu.wordcount

/**
  * Project:Scala0906
  * Package:com.atguigu.wordcount
  * Version 1.0
  *
  * Created by chenlonghui on 2019/4/6 13:59
  */

import util.control.Breaks._
object QuitSort {

  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,34,6,8,4)
    for ( i<-arr){
      print(i)
    }
    quickSort(0,arr.length-1,arr)

  }

  def quickSort(left: Int, right: Int, arr: Array[Int]): Unit = {
    var l: Int = left
    var r: Int = right
    var mid = arr((left + right) / 2)
    var temp = 0
    breakable {
      while (l < r) {

        //左点向右遍历，直到找到比中间值大的
        while (arr(l) < mid) {
          l += 1
        }

        //从右点向左遍历，直到找到比中间值小的值
        while (arr(r) > mid) {
          r -= 1
        }
        //判断是否已经越过中间值
        if (l >= r) {
          break()
        }

        //交换数据
        temp = arr(l)
        arr(l) = arr(r)
        arr(r) = temp
      }
    }

    if(l == r){
      l += 1
      r -= 1
    }

    //向左递归
    if(left < r){
      quickSort(left,r,arr)
    }

    //向右递归
    if(right > l){
      quickSort(l,right,arr)
    }
  }


}
