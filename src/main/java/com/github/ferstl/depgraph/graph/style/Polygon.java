package com.github.ferstl.depgraph.graph.style;

import com.github.ferstl.depgraph.dot.AttributeBuilder;

class Polygon extends AbstractNode {

  int sides = 4;

  Polygon() {
    super("polygon");
  }

  @Override
  public AttributeBuilder createAttributes() {
    return super.createAttributes().addAttribute("sides", this.sides > 0 ? Integer.toString(this.sides) : null);
  }

}