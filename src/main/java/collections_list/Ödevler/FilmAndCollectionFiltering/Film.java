package main.java.collections_list.Ödevler.FilmAndCollectionFiltering;

public class Film {

        private String filmAdı;
        private int yayınYılı;
        private String filmTürü;
        private double IMDBpuanı;

        public Film(String filmAdı, int yayınYılı, String filmTürü, double IMDBpuanı) {
            this.filmAdı = filmAdı;
            this.yayınYılı = yayınYılı;
            this.filmTürü = filmTürü;
            this.IMDBpuanı = IMDBpuanı;
        }


        public String getFilmAdı() {
            return filmAdı;
        }

        public void setFilmAdı(String filmAdı) {
            this.filmAdı = filmAdı;
        }

        public int getYayınYılı() {
            return yayınYılı;
        }

        public void setYayınYılı(int yayınYılı) {
            this.yayınYılı = yayınYılı;
        }

        public String getFilmTürü() {
            return filmTürü;
        }

        public void setFilmTürü(String filmTürü) {
            this.filmTürü = filmTürü;
        }

        public double getIMDBpuanı() {
            return IMDBpuanı;
        }

        public void setIMDBpuanı(double IMDBpuanı) {
            this.IMDBpuanı = IMDBpuanı;
        }

                    @Override
        public String toString() {
            return "film{" +
                    "filmAdı='" + filmAdı + '\'' +
                    ", yayınYılı=" + yayınYılı +
                    ", filmTürü='" + filmTürü + '\'' +
                    ", IMDBpuanı=" + IMDBpuanı +
                    '}';
                    }

                }




