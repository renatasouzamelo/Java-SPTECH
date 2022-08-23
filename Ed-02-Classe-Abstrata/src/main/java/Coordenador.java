
    public abstract class Coordenador implements Ibonus {

        private String nomeCoordenador;
        private Double valorHoraAulaCoordenador;
        private int qtdHorasSemanalCoordenador;

        //Construtor
        public Coordenador(String nomeCoordenador, Double valorHoraAulaCoordenador,
                           int qtdHorasSemanalCoordenador) {
            this.nomeCoordenador = nomeCoordenador;
            this.valorHoraAulaCoordenador = valorHoraAulaCoordenador;
            this.qtdHorasSemanalCoordenador = qtdHorasSemanalCoordenador;
        }

        // Método Bonus
        @Override
        public Double getValorBonus() {
            return (valorHoraAulaCoordenador * valorHoraAulaCoordenador) + getValorBonus() *1.10;
        }

        //Get and Setter
        public String getNomeCoordenador() {
            return nomeCoordenador;
        }

        public void setNomeCoordenador(String nomeCoordenador) {
            this.nomeCoordenador = nomeCoordenador;
        }

        public Double getValorHoraAulaCoordenador() {
            return valorHoraAulaCoordenador;
        }

        public void setValorHoraAulaCoordenador(Double valorHoraAulaCoordenador) {
            this.valorHoraAulaCoordenador = valorHoraAulaCoordenador;
        }

        public int getQtdHorasSemanalCoordenador() {
            return qtdHorasSemanalCoordenador;
        }

        public void setQtdHorasSemanalCoordenador(int qtdHorasSemanalCoordenador) {
            this.qtdHorasSemanalCoordenador = qtdHorasSemanalCoordenador;
        }

        @Override
        public String toString() {
            return " Nome:{" +
                    nomeCoordenador +
                    "Valor" +
                    valorHoraAulaCoordenador +
                    "Horas semanais"+
                    qtdHorasSemanalCoordenador+
                    "Valor com bonus"+
                    getValorBonus() +
                    "}" + super.toString();
        }
    }


