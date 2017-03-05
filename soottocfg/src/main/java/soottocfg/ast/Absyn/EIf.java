package soottocfg.ast.Absyn; // Java Package generated by the BNF Converter.

public class EIf extends Elseif {
  public final Exp exp_;
  public final Stm stm_;
  public EIf(Exp p1, Stm p2) { exp_ = p1; stm_ = p2; }

  public <R,A> R accept(soottocfg.ast.Absyn.Elseif.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof soottocfg.ast.Absyn.EIf) {
      soottocfg.ast.Absyn.EIf x = (soottocfg.ast.Absyn.EIf)o;
      return this.exp_.equals(x.exp_) && this.stm_.equals(x.stm_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.exp_.hashCode())+this.stm_.hashCode();
  }


}