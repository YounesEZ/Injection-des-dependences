package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("daoV2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        return Math.random() * 60;
    }
}
