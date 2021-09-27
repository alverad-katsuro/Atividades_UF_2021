typedef struct {
    int dia, mes, ano;
} Data;

void setDia(Data *);
void setMes(Data *);
void setAno(Data *);
int validDia(Data *);
int validMes(Data *);
int validAno(Data *);