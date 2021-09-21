package three.classes;

import java.util.ArrayList;

public class Zoo implements Ferramentas{

    @Override
    public String[] classificaEspecie(Animal[] animais) {
        try {
            ArrayList<String> animais_list = new ArrayList<>();
            for (Animal animal : animais) {
                if (animais_list.contains(animal.getNomeEspecie())) {
                    continue;
                } else {
                    animais_list.add(animal.getNomeEspecie());
                }
            }
            if (animais_list.size() > 0){
                String especies[] = new String[animais_list.size()];
                for (int i = 0; i < animais_list.size(); i++) {
                    especies[i] = animais_list.get(i);   
                }
                return especies;
            } else {
                return null;
            }
        } catch (NullPointerException e) {
            return null;
        }
    }

    @Override
    public Animal[] filtraEspecie(Animal[] animais, String filtro) {
        try {
            ArrayList<Animal> animais_list = new ArrayList<>();
            for (Animal animal : animais) {
                if (animal.getNomeEspecie().equals(filtro)) {
                    animais_list.add(animal);
                }
            }
            if (animais_list.size() > 0){
                Animal especies[] = new Animal[animais_list.size()];
                for (int i = 0; i < animais_list.size(); i++) {
                    especies[i] = animais_list.get(i);   
                }
                return especies;
            } else {
                return null;
            }
        } catch (NullPointerException e) {
            return null;
        }
    }
        
        public Resultado[] contabilizaEspecies(Animal[] animais){
            ArrayList<Resultado> list_result = new ArrayList<>();
            try {
            for (Animal animal : animais) {
                boolean existe = false;
                if (list_result.size() > 0) {
                    for (Resultado result : list_result) {
                        if (result.getNomeEspecie().equals(animal.getNomeEspecie())) {
                            result.setQuantidade(result.getQuantidade() + 1);
                            existe = true;
                        }
                    }
                    if (!existe) {
                        list_result.add(new Resultado(animal.getNomeEspecie(), 1));
                    }
                } else {
                    list_result.add(new Resultado(animal.getNomeEspecie(), 1));
                }
                
            }
            if (list_result.size() > 0){
                Resultado temp[] = new Resultado[list_result.size()];
                int i = 0;
                for (Resultado resultado : list_result) {
                    temp[i] = resultado;
                    i++;
                }
                return temp;
            } else {
                return null;
            }
        } catch (NullPointerException e){
            return null;
        }
    }
}
