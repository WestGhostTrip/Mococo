public class ManagerFilms {
    private Films[] films = new Films[0];
    private int resultLength = 10;

    public ManagerFilms() {
    }

    public ManagerFilms(int resultLength) {
        this.resultLength = resultLength;
    }

    public void add(Films film) {
        int length = films.length + 1;
        Films[] tmp = new Films[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Films[] findAll() {
        return films;
    }

    public Films[] findLast() {
        if (films.length > resultLength) {
            resultLength = resultLength;
        } else {
            resultLength = films.length;
        }
        Films[] result = new Films[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}
