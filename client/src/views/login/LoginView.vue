<script setup>
import { ref } from "vue";

const loginInfo = ref({
  user: "",
  password: "",
});
const login = () => {
  console.log(loginInfo.value.user, loginInfo.value.password);
};
</script>

<template>
  <div class="login">
    <h1>Harmihack</h1>
    <div class="login__inputs">
      <input v-model="loginInfo.user" placeholder="kassu" type="text" />
      <input
        v-model="loginInfo.password"
        placeholder="parool"
        type="password"
      />
    </div>
    <button @click="login">Häkime</button>
  </div>
</template>

<style lang="scss">
.login {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 100%;
  height: 100%;
  &__inputs {
    display: grid;
    grid-row-gap: 8px;
    margin-bottom: 16px;
  }
}
</style>
