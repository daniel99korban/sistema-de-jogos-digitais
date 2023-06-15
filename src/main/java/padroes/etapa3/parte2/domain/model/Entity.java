 
package padroes.etapa3.parte2.domain.model;

/**
 *
 * @author 62040614370
 * classe será fundamental para a implementação do padrão repository
 */
public abstract class Entity {
    
    private Integer id;

    public Entity(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    // forçar novos implementadores a implementarem o metodo toString()
    @Override
    public abstract String toString();
    
}
