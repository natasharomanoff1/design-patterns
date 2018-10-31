package com.dr.designpatterns.behavioral.strategy.dynamic;

interface ListStrategy
{
  default void start(StringBuilder sb) {}
  void addListItem(StringBuilder stringBuilder, String item);
  default void end(StringBuilder sb) {}
}
