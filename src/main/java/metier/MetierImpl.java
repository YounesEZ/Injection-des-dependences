package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{
    private IDao dao;
    public MetierImpl(){}
    public MetierImpl(IDao dao){
        this.dao = dao;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul() {
        double tmp = dao.getData();
        return tmp * 540 / Math.cos(tmp * Math.PI);
    }
}
