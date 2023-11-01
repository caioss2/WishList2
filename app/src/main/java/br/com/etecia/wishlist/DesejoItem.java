class WishItem {
    private String name;
    private String description;

    public WishItem(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Adicione validação se necessário
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        // Adicione validação se necessário
        this.description = description;
    }

    @Override
    public String toString() {
        return "WishItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

