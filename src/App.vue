<template>
    <div id="app">
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <a class="navbar-brand" href="/">Robert</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup"
                    aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-item nav-link active" href="/articles">Home <span class="sr-only">(current)</span></a>
                    <a class="nav-item nav-link active" href="/aboutme">About Me <span class="sr-only">(current)</span></a>
                </div>
            </div>
        </nav>
        <div class="container mt-3">
            <router-view/>
        </div>
    </div>
</template>

<script>
    export default {
        name: 'app'
    }
</script>